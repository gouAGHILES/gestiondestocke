package com.webdiamond.gestiondestock.handlers;

import com.webdiamond.gestiondestock.exception.EntityNotFoundException;
import com.webdiamond.gestiondestock.exception.InvalidEntityException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class RestExceptionHandler  extends ResponseEntityExceptionHandler {
    @ExceptionHandler(EntityNotFoundException.class)
    public ResponseEntity<ErrorsDto> handlerException(EntityNotFoundException exception, WebRequest webRequest){
        final HttpStatus notFound = HttpStatus.NOT_FOUND;

        final ErrorsDto errorsDto = ErrorsDto.builder()
                .code(exception.getErrorCodes())
                .httpCode(notFound.value())
                .message(exception.getMessage())
                .build();

        return new ResponseEntity<>(errorsDto,notFound);

    }

    public  ResponseEntity<ErrorsDto> handlerException(InvalidEntityException exception, WebRequest webRequest){
        final HttpStatus badRequest = HttpStatus.BAD_REQUEST;

        final ErrorsDto errorsDto = ErrorsDto.builder()
                .code(exception.getErrorCodes())
                .httpCode(badRequest.value())
                .message(exception.getMessage())
                .errors(exception.getErrors())
                .build();
        return new ResponseEntity<>(errorsDto, badRequest);
    }
}
