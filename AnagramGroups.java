static int countAnagramGroups(String[] arr) {
    HashSet<String> set = new HashSet<>();

    for (String str : arr) {
        char[] chars = str.toCharArray();
        Arrays.sort(chars);
        set.add(new String(chars));
    }

    return set.size();
}
