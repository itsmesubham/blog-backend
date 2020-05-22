package in.xlabs.blogbackend.Exception;

public class PostNotFoundException extends  RuntimeException{
    public PostNotFoundException(String message){
        super(message);
    }
}
