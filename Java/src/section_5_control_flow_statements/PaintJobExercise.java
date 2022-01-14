package section_5_control_flow_statements;

public class PaintJobExercise {

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
            return -1;
        }

        double areaToCoverLeft = width * height;
        double areaCoveredByExtraBuckets = areaPerBucket * extraBuckets;
        areaToCoverLeft -= areaCoveredByExtraBuckets;

        int bucketsToBuy = 0;
        while (areaToCoverLeft > 0) {
            bucketsToBuy++;
            areaToCoverLeft -= areaPerBucket;
        }

        return bucketsToBuy;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0 || height <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        double areaToCoverLeft = width * height;

        int bucketsToBuy = 0;
        while (areaToCoverLeft > 0) {
            bucketsToBuy++;
            areaToCoverLeft -= areaPerBucket;
        }

        return bucketsToBuy;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0 || areaPerBucket <= 0) {
            return -1;
        }

        int bucketsToBuy = 0;
        while (area > 0) {
            bucketsToBuy++;
            area -= areaPerBucket;
        }

        return bucketsToBuy;
    }
}
