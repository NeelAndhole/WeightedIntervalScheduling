# WeightedIntervalScheduling
This contains an Asymptotically O(n^2) implementation of the Weighted interval scheduling problem, using a DP approach. Note that the approach could be made O(nlogn) using a Binary search procedure instead of linear search.
The input will start with an positive integer, giving the number of instances that follow. For each
instance, there will be a positive integer, giving the number of jobs. For each job, there will be a trio of
positive integers i, j and k, where i < j, and i is the start time, j is the end time, and k is the weight
