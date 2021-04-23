package myra



class Customer {
    String firstName
    String lastName
    Long  phone
    String email
    Integer total
    // static means - this variable or relationship will be constant.its not going to change.
    static hasMany = [awards:Award, onlineOrders:OnlineOrder]


    static constraints = {

        phone()
        firstName()
        lastName()
        email()
        total()


    }
}
