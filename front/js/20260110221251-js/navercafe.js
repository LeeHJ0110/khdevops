
function add() {
    const tables = document.querySelectorAll('.mainTable');

    for (i = 0; i < tables.length; i++) {
        const table = tables[i];
        
        const firstRow = table.querySelector('tr');
        
        if (firstRow) {
            const newRowHtml = "<tr>" + firstRow.innerHTML + "</tr>";
            
            table.innerHTML = table.innerHTML + newRowHtml;
        }
    }
}

function deletes() {
    const tables = document.querySelectorAll('.mainTable');

    for (i = 0; i < tables.length; i++) {
        const table = tables[i];
        const rows = table.querySelectorAll('tr');
        
        if (rows.length > 1) {
            rows[rows.length - 1].remove();
        }
    }
}