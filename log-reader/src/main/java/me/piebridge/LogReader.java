package me.piebridge;

/**
 * LogReader, similar like logcat
 * Created by thom on 2017/1/22.
 */
public class LogReader {

    static {
        System.loadLibrary("reader");
    }

    private LogReader() {

    }

    /**
     * @return system server pid
     */
    public static native int getPid();

    /**
     * read events since now, would block
     *
     * @param pid     event pid
     * @param handler event handler
     */
    public static native void readEvents(int pid, EventHandler handler);

    public static native int killDescendants(int pid);

}
