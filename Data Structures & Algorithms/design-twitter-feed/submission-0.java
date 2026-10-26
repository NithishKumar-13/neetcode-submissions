class Twitter {
    class Tweet {
        int userId;
        int tweetId;

        public Tweet(int userId, int tweetId) {
            this.userId = userId;
            this.tweetId = tweetId;
        }
    }

    List<Tweet> tweets;
    Map<Integer, Set<Integer>> followings;
    int tweetCount;

    public Twitter() {
        this.tweets = new ArrayList<>();
        this.followings = new HashMap<>();
        this.tweetCount = 0;
    }

    public void postTweet(int userId, int tweetId) {
        Tweet tweet = new Tweet(userId, tweetId);
        tweets.add(tweet);
        tweetCount++;
    }

    public List<Integer> getNewsFeed(int userId) {
        List<Integer> feed = new ArrayList<>();
        Set<Integer> users = new HashSet<>();

        // Add my userId to see my posts
        users.add(userId);

        // Add my follower's posts to my feed
        if(followings.containsKey(userId)) {
            users.addAll(followings.get(userId));
        }

        for (int i = tweetCount-1; i >=0 && feed.size() < 10; i--) {
            Tweet t = tweets.get(i);
            if (users.contains(t.userId)) {
                feed.add(t.tweetId);
            }
        }
        
        return feed;
    }

    public void follow(int followerId, int followeeId) {
        if (followings.containsKey(followerId)) {
            Set<Integer> followers = followings.get(followerId);
            followers.add(followeeId);
            followings.put(followerId, followers);
            return;
        }
        followings.put(followerId, new HashSet<>());
        followings.get(followerId).add(followeeId);
    }

    public void unfollow(int followerId, int followeeId) {
        if (followings.containsKey(followerId)) {
            Set<Integer> followers = followings.get(followerId);
            followers.remove(followeeId);
            followings.put(followerId, followers);
            return;
        }
    }
}
