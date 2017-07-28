package com.coral.javacv.basic;

import static org.bytedeco.javacpp.opencv_core.*;
import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import org.bytedeco.javacpp.opencv_imgproc;
import org.bytedeco.javacpp.opencv_imgcodecs;

/**
 * Created by ccc on 2017/7/28.
 */
public class Hello {

    public static void main(String[] args) {
        smooth("D:\\projects-coral\\javacv-sample\\src\\main\\resources\\p1.jpg");
    }

    public static void smooth(String filename) {
        IplImage image = cvLoadImage(filename);
        if (image != null) {

            opencv_imgproc.cvSmooth(image, image);
            opencv_imgcodecs.cvSaveImage(filename, image);
            cvReleaseImage(image);
        } else {
            System.err.println("Image is not existed!");
        }
    }
}
