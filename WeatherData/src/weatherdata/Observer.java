package weatherdata;

public interface Observer {
	public void update(Integer temperature, Integer pressure, Integer humidity);
}
