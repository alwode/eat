package eat

class Vendor {
	String name

    static constraints = {
		name(blank:false)
    }
	
	String toString() {
		name
	}
}
