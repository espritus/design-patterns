package project.com;

public class Demo {
    public static void main(String[] args){
        VideoContent videoContent = new VideoContent();
        Data videoData = new Data(videoContent,"video");

        DataProcessorCreator creator = new DataProcessorCreator();
        DataProcessor videoProcessor = new TextDataProcessor();
        creator.setProcessor(videoProcessor);
        creator.processData(videoData);
    }
}
