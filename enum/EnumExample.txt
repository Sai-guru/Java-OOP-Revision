/*
 * ENUM
 * An enum defines a fixed set of named constants. It is safer and clearer
 * than representing a limited set of choices with arbitrary strings.
 */
public class EnumExample {
    enum OrderStatus {
        CREATED, PAID, SHIPPED
    }

    public static void main(String[] args) {
        OrderStatus status = OrderStatus.PAID;
        if (status == OrderStatus.PAID) {
            System.out.println("The order has been paid.");
        }
        for (OrderStatus value : OrderStatus.values()) {
            System.out.println(value);
        }
    }
}
