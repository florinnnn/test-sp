package springbootstarterweb.demo;
import java.util.List;


public class TestApplication {

	public static void main(String[] args) {
		try {
			MessageReader messageReader = new MessageReader();

			// Replace "path/to/messages.json" with the actual file path
			List<Message> messages = messageReader.readMessages("file:src/messages.json");

			for (Message message : messages) {
				System.out.println(getMessage(message));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}