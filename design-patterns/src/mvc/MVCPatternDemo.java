package mvc;

public class MVCPatternDemo {

	public static void main(String[] args) {

		User model = MVCPatternDemo.loadUserFromDB();

		UserView view = new UserView();

		UserController controller = new UserController(model, view);

		controller.updateView();
		controller.setName("Zack");
		controller.updateView();

	}

	private static User loadUserFromDB() {
		User u = new User();
		u.setId(1);
		u.setName("Peter");
		return u;
	}

}
