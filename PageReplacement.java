import java.util.*;

class Page {
   private int number;
   private boolean isLoaded;

   public Page(int number) {
       this.number = number;
       this.isLoaded = false;
   }

   public int getNumber() {
       return number;
   }

   public boolean isLoaded() {
       return isLoaded;
   }

   public void load() {
       isLoaded = true;
   }

   public void unload() {
       isLoaded = false;
   }
}

class Frame {
   private Page page;

   public Frame() {
       this.page = null;
   }

   public Page getPage() {
       return page;
   }

   public void loadPage(Page page) {
       if (this.page != null) {
           this.page.unload();
       }
       this.page = page;
       this.page.load();
   }
}

class PageReplacementAlgorithm {
   protected ArrayList<Frame> frames;

   public PageReplacementAlgorithm(int numberOfFrames) {
       this.frames = new ArrayList<>();
       for (int i = 0; i < numberOfFrames; i++) {
           this.frames.add(new Frame());
       }
   }

   public void loadPage(Page page) {
       // Implement the page replacement algorithm here
   }
}

class FifoPageReplacementAlgorithm extends PageReplacementAlgorithm {
   public FifoPageReplacementAlgorithm(int numberOfFrames) {
       super(numberOfFrames);
   }

   @Override
   public void loadPage(Page page) {
       // Implement the FIFO page replacement algorithm here
   }
}

class LruPageReplacementAlgorithm extends PageReplacementAlgorithm {
   public LruPageReplacementAlgorithm(int numberOfFrames) {
       super(numberOfFrames);
   }

   @Override
   public void loadPage(Page page) {
       // Implement the LRU page replacement algorithm here
   }
}

class Display {
   public void displayFrames(ArrayList<Frame> frames) {
       // Implement the display logic here
   }
}

public class PageReplacement {
   public static void main(String[] args) {
       ArrayList<Page> reference = new ArrayList<>();
       // Initialize the reference list here

       Display display = new Display();
       FifoPageReplacementAlgorithm fifo = new FifoPageReplacementAlgorithm(3);
       LruPageReplacementAlgorithm lru = new LruPageReplacementAlgorithm(3);

       for (Page page : reference) {
           fifo.loadPage(page);
           lru.loadPage(page);
       }

       display.displayFrames(fifo.frames);
       display.displayFrames(lru.frames);
   }
}
