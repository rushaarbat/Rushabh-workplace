import PropTypes from "prop-types";

function PropsValidate(props)
{
    const{ name,age}= props;
    return(
        <>
        <h2>Name: {name}</h2>
        <h2> Age: {age}</h2>
        <h2> After 5 year my age will be:{age+5}</h2>
        </>
    );
}
PropsValidate.protoType={
name: PropTypes.toString,
age: PropTypes.number.isRequired,
//childdren add kiya//
children: PropTypes.element.isRequired,
//renderable add kiya//
renderable: PropTypes.node,

rollNumbert:    PropTypes.oneOfType([PropTypes.string,PropTypes.number]),
remark: PropTypes.any,
myArr: PropTypes.arrayOf(PropTypes.number),
//for object
//myObject:PropTypes.shape({name:PropTypes.string,age:PropTypes.number,mobile:PropTypes.string})//it will allow new property

myObject:PropTypes.exact({name:PropTypes.string,age:PropTypes.number,mobile:PropTypes.string}),

};
export default PropsValidate;