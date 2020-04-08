import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 * @author MikyMing
 * @data 2020/4/8 - 19:48
 */
public class paymentDetailView01 extends JPanel {
    private JTable table;
    // 页数
    private int page = 0;
    // 每页条数
    private int count = 20;
    private int startNum = page*count;
    private String[] t_head = new String[]{"工号","时间","岗位工资","薪级"};
    private String[][] t_date;
    private String sql;

    //Create the panel
    public paymentDetailView01(String flag,User user){
        setLayout(null);
        if ("user".equals(flag))
            sql = "select * from payment where userid='"+user.getUserId()+"' order by datetime desc";
        else if ("all".equals(flag))
            sql = "select * from payment order by userid,datetime desc";
        else
            sql = "select * from payment where userid in(select userid from user where department='"+flag+"')order by userid";
        t_date = new DataDao().get_t_datas(this.sql);
        table = new JTable();
        table.setEnabled(false);
        table.setModel(new DefaultTableModel(t_date,t_head));

        JScrollPane scrollPane = new JScrollPane();
        scrollPane.setBounds(10,43,774,474);
        add(scrollPane);
        scrollPane.setViewportView(table);

    }

    private void repaintThis(){
        this.repaint();
    }
}
