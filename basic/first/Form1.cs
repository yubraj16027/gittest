using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace shopManager
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("calc");
        }

        private void button2_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("winword");

        }

        private void button3_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("excel");

        }

        private void button4_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("powerpnt");

        }

        private void button6_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("msaccess");

        }

        private void button5_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("control");

        }

        private void button9_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("taskmgr");

        }

        private void button8_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("explorer");

        }

        private void button7_Click(object sender, EventArgs e)
        {
            System.Diagnostics.Process.Start("diskmgmt.msc");

        }

        private void linkLabel1_LinkClicked(object sender, LinkLabelLinkClickedEventArgs e)
        {
            System.Diagnostics.Process.Start("https://www.youtube.com/");
        }
    }
}
