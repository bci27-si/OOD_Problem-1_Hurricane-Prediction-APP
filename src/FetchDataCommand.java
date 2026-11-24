public class FetchDataCommand implements Command {


    private FetchData fetch;

    public FetchDataCommand(FetchData fetch) {
        this.fetch = fetch;
    }

    @Override
    public void execute() {
        fetch.fetchData();
    }
}

