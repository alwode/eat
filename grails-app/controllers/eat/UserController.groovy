package eat

class UserController {

    static scaffold = User
	
	def login() {}
	
	def handleLogin() {
		def user = User.findByUserName(params.userName)
		if (!user) {
			flash.message = "User not found for userName: ${params.userName}"
			redirect(action:'login')
			return
		} else {
			session.user = user
			redirect(controller:'technicalComponent')
		}
	}
	
	def logout() {
		if(session.user) {
			session.user = null
			redirect(action:'login')
	
		}
	}
}