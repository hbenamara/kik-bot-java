package kik.messages;

import java.util.Date;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;
import org.codehaus.jackson.annotate.JsonProperty;

/**
 * @author hbenamara
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Message {

	String from;
	String id;
	String chatId;
	String[] messageIds;
	boolean readReceiptRequested;
	String stickerPackId;
	String scanData;
	String stickerURL;
	Date timestamp;
	String type;
	String kikJsData;
	String picUrl;
	boolean noForward;
	boolean isTyping;
	String body;
	String text;
	String title;
	String url;
	String videoUrl;
	long delay;
	Date typeTime;
	String attributionName;
	String attributionIcon;
	boolean loop;
	boolean muted;
	boolean autoPlay;
	boolean NoSave;
	// User[] participants;
	String mention;
	// []picked;

	// public static String text() {
	//
	// }

	//
	// public boolean isTextMessage() {
	//
	// }
	//
	// public boolean isLinkMessage() {
	//
	// }
	//
	// public boolean isPictureMessage() {
	//
	// }
	//
	// public boolean isVideoMessage() {
	//
	// }
	//
	// public boolean isStartChattingMessage() {
	//
	// }
	//
	// public boolean isScanDataMessage() {
	// }
	//
	// public boolean isFriendPickerMessage() {
	// }
	//
	// public boolean isStickerMessage() {
	//
	// }
	//
	// public boolean isIsTypingMessage() {
	//
	// }
	//
	// public boolean isDeliveryReceiptMessage() {
	//
	// }
	//
	// public boolean isReadReceiptMessage() {
	//
	// }
	//
	// public boolean isMention() {
	//
	// }
	//
	// public Object toJson() {
	//
	// }

	public void addTextResponse(String Message) {

	}

	// TODO
	// public void addResponseKeyboard(suggestions, [isHidden],[user]) {
	//
	// }

	public String getFrom() {
		return from;
	}

	public String getId() {
		return id;
	}

	public String getChatId() {
		return chatId;
	}

	public boolean isReadReceiptRequested() {
		return readReceiptRequested;
	}

	public String getStickerPackId() {
		return stickerPackId;
	}

	public String getScanData() {
		return scanData;
	}

	public String getStickerURL() {
		return stickerURL;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getType() {
		return type;
	}

	// TODO

	// public User[] getParticipants() {
	// return participants;
	// }

	public String[] getMessageIds() {
		return messageIds;
	}

	public void setMessageIds(String[] messageIds) {
		this.messageIds = messageIds;
	}

	public String getKikJsData() {
		return kikJsData;
	}

	public void setKikJsData(String kikJsData) {
		this.kikJsData = kikJsData;
	}

	public String getPicUrl() {
		return picUrl;
	}

	public void setPicUrl(String picUrl) {
		this.picUrl = picUrl;
	}

	public boolean isNoForward() {
		return noForward;
	}

	public void setNoForward(boolean noForward) {
		this.noForward = noForward;
	}

	public boolean isTyping() {
		return isTyping;
	}

	public void setTyping(boolean isTyping) {
		this.isTyping = isTyping;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getVideoUrl() {
		return videoUrl;
	}

	public void setVideoUrl(String videoUrl) {
		this.videoUrl = videoUrl;
	}

	public long getDelay() {
		return delay;
	}

	public void setDelay(long delay) {
		this.delay = delay;
	}

	public Date getTypeTime() {
		return typeTime;
	}

	public void setTypeTime(Date typeTime) {
		this.typeTime = typeTime;
	}

	public String getAttributionName() {
		return attributionName;
	}

	public void setAttributionName(String attributionName) {
		this.attributionName = attributionName;
	}

	public String getAttributionIcon() {
		return attributionIcon;
	}

	public void setAttributionIcon(String attributionIcon) {
		this.attributionIcon = attributionIcon;
	}

	public boolean isLoop() {
		return loop;
	}

	public void setLoop(boolean loop) {
		this.loop = loop;
	}

	public boolean isMuted() {
		return muted;
	}

	public void setMuted(boolean muted) {
		this.muted = muted;
	}

	public boolean isAutoPlay() {
		return autoPlay;
	}

	public void setAutoPlay(boolean autoPlay) {
		this.autoPlay = autoPlay;
	}

	public boolean isNoSave() {
		return NoSave;
	}

	public void setNoSave(boolean noSave) {
		NoSave = noSave;
	}

	public String getMention() {
		return mention;
	}

	public void setMention(String mention) {
		this.mention = mention;
	}
}
