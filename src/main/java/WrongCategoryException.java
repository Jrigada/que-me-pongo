public class WrongCategoryException extends RuntimeException {
  public WrongCategoryException(String errorMessage) {
    super(errorMessage);
  }
}