package dn.bookshop.service.impl;

import dn.bookshop.entity.BookFileEntity;
import dn.bookshop.repository.BookFileRepository;
import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Component
@RequiredArgsConstructor
public class ResourceStorage {

    @Value("${app.upload.path}")
    private String uploadPath;

    @Value("${app.download.path}")
    private String downloadPath;

    private final BookFileRepository bookFileRepository;

    public String saveNewBookImage(MultipartFile file, String slug) throws IOException {

        String resourceURI = null;

        if (!file.isEmpty()) {
            if (!new File(uploadPath).exists()) {
                Files.createDirectories(Paths.get(uploadPath));
            }
            String fileName = slug + "." + FilenameUtils.getExtension(file.getOriginalFilename());
            Path path = Paths.get(uploadPath, fileName);
            Files.write(path, file.getBytes());
            resourceURI = "/danilanovikov/" + fileName;
            file.transferTo(path);
        }
        return resourceURI;
    }

    public Path getBookFilePath(String hash) {
        BookFileEntity bookFileEntity = bookFileRepository.findBookFileEntityByHash(hash);
        return Paths.get(bookFileEntity.getPath());
    }

    public MediaType getBookByFileMime(String hash) {
        BookFileEntity bookFileEntity = bookFileRepository.findBookFileEntityByHash(hash);
        String mimeType = URLConnection.guessContentTypeFromName(Paths.get(bookFileEntity.getPath()).toString());
        if (mimeType != null) {
            return MediaType.parseMediaType(mimeType);
        }
        return MediaType.APPLICATION_OCTET_STREAM;
    }


    public byte[] getBookFileByteArray(String hash) throws IOException {
        BookFileEntity bookFileEntity = bookFileRepository.findBookFileEntityByHash(hash);
        Path path = Paths.get(downloadPath,bookFileEntity.getPath());
        return Files.readAllBytes(path);




}




















}
