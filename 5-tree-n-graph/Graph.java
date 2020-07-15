class Graph{


	// Edge list
	public void edgeList(){
		int[][] graph = {{0, 1}, {1, 2}, {1, 3}, {2, 3}};
	}


	public void adjecencyList(){
		int[][]  graph = {
			{1},
			{0, 2, 3},
			{1, 3},
			{1, 2}
		};

	}


	public void useHMap(){

		Map<Integer, List<Integer>> grap = new HashMap<>(){
			{
				put(0, Arrays.asList(1));
				put(1, Arrays.asList(0, 2, 3));
				put(2, Arrays.asList(1, 3));
				put(3, Arrays.asList(1, 2));
			}
		}
	}


	public void adjacentList(){

		int[][] graph = {
			{0, 1, 0, 0},
			{1, 0, 1, 1},
			{0, 1, 0, 1},
			{0, 1, 1, 0}
		};
	}
}