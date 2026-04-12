//HelloApp-UC4
public class HelloApp{
	public static void main(String[] args){
		String names;
		if (args.length>0){
			StringBuilder nameBuilder = new StringBuilder();
			for (int i=0; i<args.length; i++) {
				nameBuilder.append(args[i]);
				if(i<args.length-1){
					nameBuilder.append(", ");
					}}
		else{nameBuilder.append("World!")}
			name="World";}
System.out.println("Hello, "+names+"!")
		