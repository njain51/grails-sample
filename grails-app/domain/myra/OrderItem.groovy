package myra

class OrderItem {

    Integer quantity
    Float totalPrice
    static belongsTo = [onlineOrders:OnlineOrder, product:Product]


    static constraints = {
    }
}
