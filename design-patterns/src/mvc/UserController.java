package mvc;

public class UserController {

	private User model;
	private UserView view;

	public UserController(User model, UserView view) {
		this.model = model;
		this.view = view;
	}

	public void setId(Integer id) {
		model.setId(id);
	}

	public Integer getId() {
		return model.getId();
	}

	public void setName(String name) {
		model.setName(name);
	}

	public String getName() {
		return model.getName();
	}

	public void updateView() {
		view.printUserDetails(model.getId(), model.getName());
	}

}
