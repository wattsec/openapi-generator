/**
 * OpenAPI Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

import { HttpFile } from '../http/http';

export class OuterComposite {
    'myNumber'?: number;
    'myString'?: string;
    'myBoolean'?: boolean;

    static readonly discriminator: string | undefined = undefined;

    static readonly mapping: {[index: string]: string} | undefined = undefined;

    static readonly attributeTypeMap: Array<{name: string, baseName: string, type: string, format: string}> = [
        {
            "name": "myNumber",
            "baseName": "my_number",
            "type": "number",
            "format": ""
        },
        {
            "name": "myString",
            "baseName": "my_string",
            "type": "string",
            "format": ""
        },
        {
            "name": "myBoolean",
            "baseName": "my_boolean",
            "type": "boolean",
            "format": ""
        }    ];

    static getAttributeTypeMap() {
        return OuterComposite.attributeTypeMap;
    }

    public constructor() {
    }
}
