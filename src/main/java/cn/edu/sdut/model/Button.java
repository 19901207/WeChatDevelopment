package cn.edu.sdut.model;

/**
 * button实体类 view:跳转URL 用户点击view类型按钮后，微信客户端将会打开开发者在按钮中填写的网页URL，
 * 可与网页授权获取用户基本信息接口结合，获得用户基本信息。
 */
public class Button {
	private String type;
	private String name;
	private Button[] sub_button;

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Button[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(Button[] sub_button) {
		this.sub_button = sub_button;
	}

}
