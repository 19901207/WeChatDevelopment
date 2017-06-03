package cn.edu.sdut.model;

public class VoiceMessage {
	private String ToUerName;
	private String FromUserName;
	private String CreateTime;
	private String MsgType;
	private String MediaId;
	private String Format;
	private String MsgId;

	public String getToUerName() {
		return ToUerName;
	}

	public void setToUerName(String toUerName) {
		ToUerName = toUerName;
	}

	public String getFromUserName() {
		return FromUserName;
	}

	public void setFromUserName(String fromUserName) {
		FromUserName = fromUserName;
	}

	public String getCreateTime() {
		return CreateTime;
	}

	public void setCreateTime(String createTime) {
		CreateTime = createTime;
	}

	public String getMsgType() {
		return MsgType;
	}

	public void setMsgType(String msgType) {
		MsgType = msgType;
	}

	public String getMediaId() {
		return MediaId;
	}

	public void setMediaId(String mediaId) {
		MediaId = mediaId;
	}

	public String getFormat() {
		return Format;
	}

	public void setFormat(String format) {
		Format = format;
	}

	public String getMsgId() {
		return MsgId;
	}

	public void setMsgId(String msgId) {
		MsgId = msgId;
	}
}
