package Source;

/**
 * Created by sneha on 7/28/16.
 */

import android.net.Uri;

public class cappedPhoto {
private String caption;
private String photo;

 public cappedPhoto(String b, String str)
        {
        caption = new String(str);
        photo = new String(b);
        }


public Uri stringToUri (String a)
        {
        Uri u = Uri.parse(a);
        return u;
        }
        } //Object for photo Uri and caption