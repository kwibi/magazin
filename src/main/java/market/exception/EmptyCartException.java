package market.exception;

import org.springframework.validation.FieldError;

/**
 * Заказ не может быть оформлен: корзина пуста.
 */
public class EmptyCartException extends Exception {
    
    public EmptyCartException() {
        super("");
    }

    public EmptyCartException(String message) {
        super(message);
    }
    
    public FieldError getFieldError() {
        String[] codes = {"NotEmpty.cart"};
        Object[] arguments = {"items"};
        return new FieldError("cart", "items", "", false, codes, arguments, "");
    }
}
