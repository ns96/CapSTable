# -*- coding: utf-8 -*-
"""
Simple script to generate a capitalization table spreadsheet

Created on Fri Aug 2 09:47:09 2019
@version 0.1.3
@author: nathan
"""
from flask import Flask
from flask import send_file
from openpyxl import load_workbook
from tempfile import NamedTemporaryFile

# define the template file. change on server
spreadsheet_file = 'cap_table_builder.xlsx';

# the name of the flask application
app = Flask(__name__)

@app.route('/')
def index():
    return 'Capitalization Table Builder'

@app.route('/capstable/<input_data>')
def create_captable(input_data):
    '''
    Generate capitalization table spreadsheet
    '''
    
    data_list = input_data.split('\n')
    #print(data_list, len(data_list))
    for i in range(len(data_list)):
        print(i, data_list[i])
    
    # load the template excel file
    wb = load_workbook(spreadsheet_file)
    
    # update the input sheet values
    sheet = wb['INPUTS']
    
    sheet['C7'] = data_list[0]                  # company name
    sheet['B25'] = int(data_list[1])            # year founded
    sheet['D11'] = int(data_list[2])            # initial number of shares
    
    sheet['A14'] = data_list[3]                 # founder 1
    sheet['D14'] = to_percent(data_list[4])     # founder 1 shares
    sheet['A15'] = data_list[5]                 # founder 2
    sheet['D15'] = to_percent(data_list[6])     # founder 2 shares
    sheet['A16'] = data_list[7]                 # founder 3
    sheet['D16'] = to_percent(data_list[8])     # founder 3 shares
    sheet['A17'] = data_list[9]                 # founder 4
    sheet['D17'] = to_percent(data_list[10])    # founder 4 shares
    sheet['A18'] = data_list[11]                # founder 5
    sheet['D18'] = to_percent(data_list[12])    # founder 5 shares
    sheet['A19'] = data_list[13]                # founder 6
    sheet['D19'] = to_percent(data_list[14])    # founder 6 shares
    sheet['D21'] = to_percent(data_list[15])    # employee options
    
    sheet['C31'] = int(data_list[16])           # family and friends round 1 amount
    sheet['D31'] = to_percent(data_list[17])    # family and friends round 1 percent
    sheet['B33'] = int(data_list[18])           # family and friends round 1 year
    sheet['C39'] = int(data_list[19])           # family and friends round 2 amount
    sheet['D39'] = to_percent(data_list[20])    # family and friends round 2 percent
    sheet['B41'] = int(data_list[21])           # family and friends round 2 year
    
    sheet['A47'] = data_list[22]                # angel investor name
    sheet['C47'] = int(data_list[23])           # angel amount
    sheet['D47'] = to_percent(data_list[24])    # angel percentage
    sheet['F47'] = int(data_list[25])           # angel return preference
    sheet['G47'] = to_percent(data_list[26])    # angel dividend
    sheet['B49'] = int(data_list[27])           # angel year
    
    sheet['A54'] = data_list[28]                # pre-series A name
    sheet['C55'] = int(data_list[29])           # pre-series A amount
    sheet['D55'] = to_percent(data_list[30])    # pre-series A percent
    sheet['B57'] = int(data_list[31])           # pre-series A year
    
    sheet['B68'] = int(data_list[32])           # series A year
    
    sheet['A64'] = data_list[33]                # series A 1 name
    sheet['C64'] = int(data_list[34])           # sereis A 1 amount
    sheet['D64'] = to_percent(data_list[35])    # series A 1 percentage
    sheet['F64'] = int(data_list[36])           # series A 1 return preference
    sheet['G64'] = to_percent(data_list[37])    # series A 1 dividend
    
    sheet['A65'] = data_list[38]                # series A 2 name
    sheet['C65'] = int(data_list[39])           # sereis A 2 amount
    sheet['D65'] = to_percent(data_list[40])    # series A 2 percentage
    sheet['F65'] = int(data_list[41])           # series A 2 return preference
    sheet['G65'] = to_percent(data_list[42])    # series A 2 dividend
    
    sheet['A66'] = data_list[43]                # series A 3 name
    sheet['C66'] = int(data_list[44])           # sereis A 3 amount
    sheet['D66'] = to_percent(data_list[45])    # series A 3 percentage
    sheet['F66'] = int(data_list[46])           # series A 3 return preference
    sheet['G66'] = to_percent(data_list[47])    # series A 3 dividend
    
    # update the waterfall sheet
    sheet = wb['WATERFALL']
    
    sheet['C3'] = int(data_list[48])
    sheet['C4'] = int(data_list[49])
    
    # DEBUG code
    #wb.save('TestCTB.xlsx')
    
    # send the excel file
    with NamedTemporaryFile(delete=False) as tmp:
        wb.save(tmp.name)
    
    return send_file(tmp.name, attachment_filename='CapTableBuilder.xlsx', as_attachment=True)
    #return input_data

def to_percent(value):
    return float(value)/100

def run_test():
    input_data = 'CellTex, Inc.\n2019\n1000000\nFounder 1\n20\nFounder 2\n20\nFounder 3\n20\nFounder 4\n10\nFounder 5\n10\nFounder 6\n10\n10\n100000\n25\n2019\n150000\n20\n2019\nBio Angels\n1000000\n20\n1\n0\n2020\nJane Doe\n250000\n15\n2020\n2021\nVC # 1\n10000000\n20\n1\n0\nVC # 2\n2500000\n5\n1\n0\nVC # 3\n2500000\n5\n1\n0\n350000000\n2024'
    create_captable(input_data)
    
# start the web application
if __name__ == "__main__" :
    app.run(host = '0.0.0.0', threaded=False, debug=True)
    #run_test()