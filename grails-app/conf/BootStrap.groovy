class BootStrap {

    def init = { servletContext ->
	
	new eat.User(userName: "p576093", firstName: "Alexander", lastName: "Wodniok").save()
	new eat.User(userName: "p576094", firstName: "Anna", lastName: "Wodniok").save()
	new eat.User(userName: "p576095", firstName: "Paula", lastName: "Wodniok").save()
	new eat.User(userName: "p576096", firstName: "Luisa", lastName: "Wodniok").save()
	
	new eat.Vendor(name: "IBM").save()
	new eat.Vendor(name: "HP").save()
	new eat.Vendor(name: "CA").save()
	new eat.Vendor(name: "TIBCO").save()
	new eat.Vendor(name: "MICROSOFT").save()
	new eat.Vendor(name: "ORACLE").save()
	
	new eat.TechnicalComponent(name: "WebSphere Application Server", createdDate: new Date(), vendor: 		eat.Vendor.findByName("IBM")).save()
	new eat.TechnicalComponent(name: "AMX BPM", createdDate: new Date(), vendor: 		eat.Vendor.findByName("TIBCO")).save()
	new eat.TechnicalComponent(name: "Microsoft Office Sharepoint Server", createdDate: new Date(), vendor: 		eat.Vendor.findByName("MICROSOFT")).save()
	new eat.TechnicalComponent(name: "Rational Team Concert", createdDate: new Date(), vendor: 		eat.Vendor.findByName("IBM")).save()
	new eat.TechnicalComponent(name: "WebSphere MQ", createdDate: new Date(), vendor: 		eat.Vendor.findByName("IBM")).save()
	new eat.TechnicalComponent(name: "WebSphere Portal Server", createdDate: new Date(), vendor: 		eat.Vendor.findByName("IBM")).save()
    }
    def destroy = {
    }
}
