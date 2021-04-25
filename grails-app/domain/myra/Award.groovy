package myra

class Award {

    Date awardDate
    String type
    Integer points
    // static means - this variable or relationship will be constant.
    static belongsTo = [customer:Customer]


    static constraints = {

        awardDate(nullable: false)
        type(nullable: true, inList: ["Purchase", "Reward"])
        points(nullable: true)
    }
}
