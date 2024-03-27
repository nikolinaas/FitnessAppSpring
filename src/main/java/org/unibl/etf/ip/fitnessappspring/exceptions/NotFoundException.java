package org.unibl.etf.ip.fitnessappspring.exceptions;

import org.springframework.http.HttpStatus;

public class NotFoundException extends HttpException{
    public NotFoundException(){super(HttpStatus.NOT_FOUND,null);}
    public NotFoundException(Object data){ super(HttpStatus.NOT_FOUND,data);}
}
