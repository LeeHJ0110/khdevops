import React, { useEffect, useState } from 'react';

function Hello() {
    const [num, setNum] = useState(0);

    const timer = setTimeout(() => {
        console.log('타이머');
    }, 3000);

    useEffect(() => {
        console.log('이펙트');
        return () => {
            clearInterval(timer);
        };
    }, [num]);

    console.log('Hello render');

    function plusNum() {
        setNum(num + 1);
    }
    return (
        <>
            <h1>hello</h1>
            <h3>num : {num}</h3>
            <button onClick={plusNum}>plus</button>
        </>
    );
}

export default Hello;
