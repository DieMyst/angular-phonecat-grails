class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')

        "/phones/phones.json" {
            controller = "phones"
        }

        "/phones/${phoneId}.json" {
            controller = "phones"
            action = "showPhone"
        }
	}
}
