package exceptionTest;

public class IllegalSSNException extends IllegalArgumentException {
   public IllegalSSNException(String message) {
      super(message);
   }
}
