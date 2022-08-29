package curso.practicas.utils;

public class ResponseObject {
    
    private Object data;

    private int codeHttpStatus;

    private String messageError;


    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public int getCodeHttpStatus() {
        return this.codeHttpStatus;
    }

    public void setCodeHttpStatus(int codeHttpStatus) {
        this.codeHttpStatus = codeHttpStatus;
    }

    public String getMessageError() {
        return this.messageError;
    }

    public void setMessageError(String messageError) {
        this.messageError = messageError;
    }

    public ResponseObject(Object data, int code, String messageError) {
        this.data = data;
        this.codeHttpStatus = codeHttpStatus;
        this.messageError = messageError;
    }

}
