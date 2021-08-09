import java.lang.*;
import java.net.MalformedURLException;

class DataFetcher {
    String fetchDataFromUrl(String url) throws MalformedURLException {
        if(url == null) {
            throw new MalformedURLException("Url Not found");
        }
        /*else{
            throw new CheckedException("URL not found");
        }*/

        String data = null;
        return data;
    }
}

class CheckedException extends Exception {
    public CheckedException(String message) {
        super(message);
    }
}

class UncheckedException extends RuntimeException {
    public UncheckedException(String message) {
        super(message);
    }
}

class DataFetcherDemo {
    private DataFetcher dataFetcher;

    public DataFetcherDemo(DataFetcher dataFetcher) {
        this.dataFetcher = dataFetcher;
    }

    public void fetchData() {
        String url = "https://google.com";
        try {
            String fetchedData = dataFetcher.fetchDataFromUrl(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        try {
            String fetchData = dataFetcher.fetchDataFromUrl(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
}
