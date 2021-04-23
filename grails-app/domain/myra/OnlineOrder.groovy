package myra

// Changed Order class name to something else since Order is keyword in grails.
class OnlineOrder {

    Date orderDate
    Integer orderNumber
    Float orderTotal
    static hasMany = [orderItems:OrderItem]
    static belongsTo = [customer:Customer]



    static constraints = {

        orderNumber()
        orderDate()
        orderTotal()

    }
}
