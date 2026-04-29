class TimeMap {

    class Pair {
        int timestamp;
        String value;

        Pair(int t, String v) {
            this.timestamp = t;
            this.value = v;
        }
    }

    java.util.Map<String, java.util.List<Pair>> map;

    public TimeMap() {
        map = new java.util.HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new java.util.ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) return "";

        java.util.List<Pair> list = map.get(key);

        int left = 0, right = list.size() - 1;
        String result = "";

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (list.get(mid).timestamp == timestamp) {
                return list.get(mid).value;
            } else if (list.get(mid).timestamp < timestamp) {
                result = list.get(mid).value;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return result;
    }
}