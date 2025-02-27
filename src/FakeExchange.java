public class FakeExchange implements Exchange {

    @Override
    public float rate(String origin, String target) {
        // TODO Auto-generated method stub
        // For testing, we'll return a fixed conversion rate
        // For USD to Euro, let's say 1 USD = 0.85 Euro
        if ("USD".equals(origin) && "Euro".equals(target)) {
            return 0.85f;
        }
        // Default case or other currency pairs
        return 1.0f;
    }
    
}
