package myra

class Product {
    // lets define different fields in our domain
    String name
    String sku
    Float price

   static  hasMany = [orderItems:OrderItem]


    static constraints = {
    }


}
