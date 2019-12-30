class JournalPaper extends WrittenItem
{
	private int year;
	public JournalPaper(int id, String title, int copies, String authorname,int year) {
		super(id, title, copies, authorname);
		this.year=year;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "JournalPaper [year=" + year
				+ super.toString() +"]";
	}

	
}
