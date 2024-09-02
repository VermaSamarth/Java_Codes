class demo implements google, yahoo {

    public String search1(String srch) {
        return "Searching for the results of "+srch+" on yahoo...";
    }

    public String search(String srch)
    {
        return "Searching for the results of "+srch+" on google...";
    }

    public String display1(String s)
    {
        return "Here are the results from yahoo...";
    }

    public String display(String s)
    {
        return "Here are the results from google...";
    }

}
