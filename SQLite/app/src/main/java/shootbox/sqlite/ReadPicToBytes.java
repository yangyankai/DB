package shootbox.sqlite;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import java.io.IOException;
import java.io.InputStream;
import shootbox.sqlite.R;
/**
 * Created by ykai on 2015/8/19.
 */
public class ReadPicToBytes {
    public static byte[] read(Context context){
        try {
            //得到资源中的Raw数据流
            InputStream in = context.getResources().openRawResource(R.raw.p2);
            //得到数据的大小
            int length = 0;
            length = in.available();
            byte [] buffer = new byte[length];
            in.read(buffer);
            in.close();
            return buffer;
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }

    public static Bitmap Bytes2Bimap(byte[] b) {
        if (b.length != 0) {
            return BitmapFactory.decodeByteArray(b, 0, b.length);
        } else {
            return null;
        }
    }
}
