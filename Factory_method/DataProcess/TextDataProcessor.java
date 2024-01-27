package project.com;

public class TextDataProcessor extends DataProcessor{
    public void createDataProcessor(Data data) {
        String text = (String) data.getContent();
    }
}
class AudioDataProcessor extends DataProcessor{
    public void createDataProcessor(Data data) {
        byte[] audio = (byte[]) data.getContent();
    }

}
class  VideoDataProcessor extends DataProcessor{
    public void createDataProcessor(Data data) {
        byte[] video = (byte[]) data.getContent();
    }
}