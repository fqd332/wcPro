public static void writetxt(String res,String path) throws IOException
{
    //������ı�
    File myFile=new File(path);
    BufferedWriter out = new BufferedWriter(new FileWriter(myFile));
    out.write(res);
    out.close();
}

