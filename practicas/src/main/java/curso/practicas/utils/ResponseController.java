package curso.practicas.utils;

public class ResponseController {
    public ResponseObject setResponse(Object data, int code, String messageError){
        return new ResponseObject(data, code, messageError);
    }
}
