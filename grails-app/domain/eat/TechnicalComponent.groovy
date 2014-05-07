package eat

class TechnicalComponent {

	String name
	String description
	Date createdDate
	String remark
	Vendor vendor

    static constraints = {
		name(blank:false)
		description(maxSize:1000, nullable:true)
		vendor()
		createdDate()
		remark(maxSize:1000, nullable:true)
		vendor(nullable:true)
    }
	
	String toString() {
		name
	}
}
